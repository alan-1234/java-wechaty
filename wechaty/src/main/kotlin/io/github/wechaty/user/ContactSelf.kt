package io.github.wechaty.user

import io.github.wechaty.Wechaty
import io.github.wechaty.filebox.FileBox
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Future

class ContactSelf(wechaty: Wechaty,id: String) : Contact(wechaty,id){

    override fun avatar(): Future<FileBox> {
        return super.avatar()
    }

    fun avatar(fileBox:FileBox):Future<Void>{
        return CompletableFuture.supplyAsync {
            puppet.setContactAvatar(super.id, fileBox)
            null
        }

    }

}
