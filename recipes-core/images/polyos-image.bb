include recipes-core/images/core-image-minimal.bb
include recipes-fsl/packagegroups/packagegroup-fsl-tools-bluetooth.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	" 
IMAGE_FEATURES += " ssh-server-openssh"
IMAGE_INSTALL_append = " u-boot-fw-utils-pv alsa-utils usbutils i2c-tools wpa-supplicant iperf polyos-wifi shairport-sync bluez5 ntp polyos-updater fsl-alsa-plugins "

DISTRO_FEATURES_remove = "gtk+ gtk+3 pulseaudio"
#DISTRO_FEATURES_append = " pulseaudio"

# Add extra space to the rootfs image  
#IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 20000"  
IMAGE_ROOTFS_SIZE = "490000"
