// Copyright 2023 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.firebase.messaging.ktx

import androidx.annotation.Keep
import com.google.firebase.components.Component
import com.google.firebase.components.ComponentRegistrar
import com.google.firebase.messaging.BuildConfig
import com.google.firebase.platforminfo.LibraryVersionComponent

internal const val LIBRARY_NAME: String = "fire-fcm-ktx"

/** @suppress */
@Keep
class FirebaseMessagingLegacyRegistrar : ComponentRegistrar {
  override fun getComponents(): List<Component<*>> {
    return listOf(LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME))
  }
}
