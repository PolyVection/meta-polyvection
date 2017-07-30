include recipes-core/images/core-image-minimal.bb

######################
### KERNEL MODULES ###
######################

IMAGE_INSTALL += " \
	kernel-modules \
	" 

################
### FEATURES ###
################

IMAGE_FEATURES += " ssh-server-openssh"



###############
### NETWORK ###
###############

IMAGE_INSTALL_append +=" \
	wpa-supplicant \
	polyos-wifi \
	iperf3 \
	ntp \
	iw \
	wireless-firmware-rtl \
	wireless-firmware-mt \
	curl \
	hostapd-rtl \
	dhcp-server \
	systemd-network \
	systemd-wlan0 \
	"


#############
### AUDIO ###
#############

IMAGE_INSTALL_append +=" \
	alsa-utils \
	alsa-asound \
	fsl-alsa-plugins \
	"


#################
### STREAMING ###
#################

IMAGE_INSTALL_append +=" \
	shairport-sync \
	librespot \
	"


##############
### SYSTEM ###
##############

IMAGE_INSTALL_append +=" \
	pv \
	libxml2-dev \
	usbutils \
	i2c-tools \
	polyos-updater \
	u-boot-fw-utils-pv \
	systemd-serialgetty \
	"

#################
### ROOT SIZE ###
#################

IMAGE_ROOTFS_SIZE = "490000" 



