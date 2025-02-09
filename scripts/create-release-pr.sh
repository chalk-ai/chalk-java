#!/bin/bash

set -e  # Exit immediately on error

# Ensure the script is run from the main branch
CURRENT_BRANCH=$(git rev-parse --abbrev-ref HEAD)
if [ "$CURRENT_BRANCH" != "main" ]; then
  echo "Error: Release script must be run from the main branch."
  exit 1
fi

# Latest main
git pull

# Ensure a version argument is provided
if [ -z "$1" ]; then
  echo "Usage: $0 <version>"
  exit 1
fi

# Remove leading 'v' if present
VERSION="${1#v}"

BRANCH_NAME="release/$VERSION"

# Create a new branch
git checkout -b "$BRANCH_NAME"

# Update README.md and gradle.properties
sed -i '' "s|implementation 'ai.chalk:chalk-java:[0-9.]*'|implementation 'ai.chalk:chalk-java:$VERSION'|" README.md
sed -i '' "s|<version>[0-9.]*</version>|<version>$VERSION</version>|" README.md
sed -i '' "s/^version=.*/version=$VERSION/" gradle.properties

# Commit and push changes
git add README.md gradle.properties
git commit -m "[generated] Release version $VERSION"
git push origin "$BRANCH_NAME"

# Create the PR and capture the PR URL
PR_URL=$(gh pr create --base main --head "$BRANCH_NAME" \
    --title "[generated] Release $VERSION" \
    --body "PR generated by create-release-pr.sh")

# Extract PR number from the PR URL (assuming format: https://github.com/org/repo/pull/123)
PR_NUMBER=$(echo "$PR_URL" | grep -oE '[0-9]+$')

# Apply the 'release' label to the newly created PR
echo "Applying release label to PR #$PR_NUMBER..."

gh pr edit "$PR_NUMBER" --add-label "release"

echo "Tagged PR #$PR_NUMBER with 'release' label."
