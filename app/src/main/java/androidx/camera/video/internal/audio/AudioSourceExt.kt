/*
 * SPDX-FileCopyrightText: 2023 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package androidx.camera.video.internal.audio

import android.annotation.SuppressLint

val AudioSource.muted
    @SuppressLint("RestrictedApi")
    get() = mMuted
