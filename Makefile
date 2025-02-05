release:
# Extract version from the first argument after 'release'
	$(eval VERSION := $(filter-out $@, $(MAKECMDGOALS)))

	@if [ -z "$(VERSION)" ]; then \
		echo "❌ ERROR: Version is required! Usage: make release <version>"; \
		exit 1; \
	fi

# Run the version update script
	@echo "Creating Release PR for version $(VERSION)..."
	@./scripts/create-release-pr.sh $(VERSION)


# Prevents Make from treating the version as a target
%:
	@:
