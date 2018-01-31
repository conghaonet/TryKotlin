package chapter0705c

import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener
import kotlin.reflect.KProperty

/*
open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}
*/

class ObservableProperty(var propValue: Int, val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: Person, prop: KProperty<*>): Int = propValue

    operator fun setValue(p: Person, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}
class Person(val name: String, age: Int, salary: Int) {
    val changeSupport = PropertyChangeSupport(this)
    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)
}

fun main(args: Array<String>) {
    val p = Person("Dmit ry", 34, 2000)
/*
    p.changeSupport.addPropertyChangeListener("age") {
        println("Property ${it.propertyName} changed from ${it.oldValue} to ${it.newValue}")
    }
    p.changeSupport.addPropertyChangeListener("salary") {
        println("Property ${it.propertyName} changed from ${it.oldValue} to ${it.newValue}")
    }
*/
    p.changeSupport.addPropertyChangeListener {
        println("Property ${it.propertyName} changed from ${it.oldValue} to ${it.newValue}")
    }

/*
        changeSupport.addPropertyChangeListener(
            PropertyChangeListener { event ->
                println("Property ${event.propertyName} changed " +
                        "from ${event.oldValue} to ${event.newValue}")
            }
    )
*/
    p.age = 35
    p.salary = 2100
}