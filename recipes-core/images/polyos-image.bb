include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	" 
IMAGE_FEATURES += " ssh-server-openssh"
IMAGE_INSTALL_append = "alsa-utils usbutils wpa-supplicant iperf wireless-pv shairport-sync gmrender-resurrect bluez5"

DISTRO_FEATURES_remove = "gtk+ gtk+3"

# Add extra space to the rootfs image  
IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 20000"  
