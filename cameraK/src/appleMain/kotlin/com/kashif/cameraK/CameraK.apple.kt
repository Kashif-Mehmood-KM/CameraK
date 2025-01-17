package com.kashif.cameraK

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun CameraKPreview(modifier: Modifier,cameraController: CameraController) {
    if (checkCameraPermission() && checkStoragePermission()) {
        cameraController.CameraPreview(modifier = modifier)
    }
}

