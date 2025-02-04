release:
# Extract version from the first argument after 'release'
	$(eval VERSION := $(filter-out $@, $(MAKECMDGOALS)))

	@if [ -z "$(VERSION)" ]; then \
		echo "❌ ERROR: Version is required! Usage: make release <version>"; \
		exit 1; \
	fi

	@echo "Creating GitHub Release for version $(VERSION)..."
# Ensure the version has a "v" prefix
	$(eval TAG := $(shell echo $(VERSION) | sed 's/^v*/v/'))
	@echo "Using tag: $(TAG)"
	gh release create $(TAG) --generate-notes

# Prevents Make from treating the version as a target
%:
	@: