package chapter0705d

import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class Person(val name: String, age: Int, salary: Int, city: String) : PropertyChangeAware() {

    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    private val observerB = {
        prop: KProperty<*>, oldValue: String, newValue: String ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
    var city: String by Delegates.observable(city, observerB)
//    Delegates.observable(city, observerB)
}

fun main(args: Array<String>) {
    val p = Person("Dmitry", 34, 2000, "Beijing")
    p.addPropertyChangeListener(
            PropertyChangeListener { event ->
                println("Property ${event.propertyName} changed " +
                        "from ${event.oldValue} to ${event.newValue}")
            }
    )
    p.age = 35
    p.salary = 2100
    p.city = "Shanghai"
}
