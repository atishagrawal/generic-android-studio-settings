#parse("File Header.java")

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end

#parse("Class Definition.java")
interface ${NAME} {
}