include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	" 
IMAGE_FEATURES += " ssh-server-openssh"
IMAGE_INSTALL_append = "usbutils wpa-supplicant iperf wireless-pv shairport-sync bluez5"

DISTRO_FEATURES_remove = "gtk-2.0 gtk-3.0"

# Add extra space to the rootfs image  
IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 20000"  
