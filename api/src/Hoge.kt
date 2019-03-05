package jp.hkento

import io.konform.validation.Validation
import io.konform.validation.ValidationResult
import io.konform.validation.Valid
import io.konform.validation.jsonschema.maxLength

class Hoge(val name: String) {
    fun validate(): Boolean {
        val validator = Validation<Hoge> {
            Hoge::name {
                maxLength(3)
            }
        }
        val result = validator.validate(this)
        return result is Valid
    }
}
