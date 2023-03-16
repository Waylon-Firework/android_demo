package com.ld.my_image_loader

import java.util.*
import kotlin.collections.ArrayList

object ServiceHelper {

    fun <T> getServices(interfaceClass: Class<T>?): List<T>? {
        val loader = ServiceLoader.load(interfaceClass)
        val iterator: Iterator<*> = loader.iterator()
        val list: MutableList<T> = ArrayList()
        while (iterator.hasNext()) {
            val t: T? = iterator.next() as T
            if (t != null) {
                list.add(t)
            }
        }
        return list
    }

    fun <T> getService(interfaceClass: Class<T>?): T? {
        val loader = ServiceLoader.load(interfaceClass)
        val iterator: Iterator<T> = loader.iterator()
        return if (iterator.hasNext()) {
            iterator.next()
        } else {
            null
        }
    }
}