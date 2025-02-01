SUMMARY = "Tuantn Example"
DESCRIPTION = "Tuantn application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://tuantn.c"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} tuantn.c ${LDFLAGS} -o tuantn
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 tuantn ${D}${bindir}
}
