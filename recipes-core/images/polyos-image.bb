include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	" 
IMAGE_FEATURES += " ssh-server-openssh"
IMAGE_INSTALL_append = "u-boot-fw-utils-pv alsa-utils usbutils wpa-supplicant iperf wireless-pv shairport-sync gmrender-resurrect bluez5 polyos-updater"

DISTRO_FEATURES_remove = "gtk+ gtk+3"

# Add extra space to the rootfs image  
#IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 20000"  
IMAGE_ROOTFS_SIZE = "490000"
