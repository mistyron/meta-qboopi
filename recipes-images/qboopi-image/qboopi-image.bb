SUMMARY = "A custom minimal qboopi image"
DESCRIPTION = "A minimal custom qboopi image that inherits the core-image-minimal recipe and adds customizations."

# Inherit the core-image-minimal recipe, which provides the base for our image.
# This brings in all the packages and configurations from the base minimal image.
inherit core-image

# Add "ext4" and "wic" to the list of image filesystem types.
# The "wic" type is the modern way to create a partitioned disk image.
IMAGE_FSTYPES += " ext4 wic"
