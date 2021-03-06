package com.vitorblog.compiler.function

import com.vitorblog.compiler.dao.VariableDao
import com.vitorblog.compiler.model.Function
import com.vitorblog.compiler.model.MandettaClass
import com.vitorblog.compiler.parser.ValueParser
import com.vitorblog.compiler.util.StringUtils

class PrintlnFunction : Function {

    override val name = "println"
    override val args = 1

    override
    fun execute(arguments: List<String>) {

        val arg = arguments[0]
        val text = ValueParser.getRealValue(arg)

        MandettaClass.instance.mandettaHandler.consoleOutput("$text\n")

    }

}