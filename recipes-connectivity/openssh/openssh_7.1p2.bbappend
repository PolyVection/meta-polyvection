FILESEXTRAPATHS_prepend := "${THISDIR}/openssh:"
SRC_URI += "file://init"

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/sshd
}
