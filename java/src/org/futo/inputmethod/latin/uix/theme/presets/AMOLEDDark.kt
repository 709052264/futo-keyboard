package org.futo.inputmethod.latin.uix.theme.presets

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.futo.inputmethod.latin.R
import org.futo.inputmethod.latin.uix.extendedDarkColorScheme
import org.futo.inputmethod.latin.uix.theme.ThemeOption
import org.futo.inputmethod.latin.uix.theme.selector.ThemePreview

internal val AMOLEDDarkScheme = extendedDarkColorScheme(
    // 主色/高亮色：改为纯白色，去掉了原本的浅紫
    primary=Color(0xFFFFFFFF),
    onPrimary=Color(0xFF000000),
    primaryContainer=Color(0xFF333333),
    onPrimaryContainer=Color(0xFFE6E1E5),
    
    // 次要色：改为浅灰色
    secondary=Color(0xFFCCCCCC),
    onSecondary=Color(0xFF000000),
    secondaryContainer=Color(0xFF1E1E1E), // 深灰
    onSecondaryContainer=Color(0xFFCCCCCC),
    
    // 第三色：改为浅灰色
    tertiary=Color(0xFFEEEEEE),
    onTertiary=Color(0xFF000000),
    tertiaryContainer=Color(0xFF444444),
    onTertiaryContainer=Color(0xFFE6E1E5),
    
    error=Color(0xFFFA7C75),
    onError=Color(0xFF591A16),
    errorContainer=Color(0xFF8C1D18),
    onErrorContainer=Color(0xFFF9AFA9),
    
    outline=Color(0xFF888888), // 边框线改为灰色
    outlineVariant=Color(0xFF333333),
    
    surface=Color(0xFF000000),
    onSurface=Color(0xFFE6E1E5),
    onSurfaceVariant=Color(0xFFCCCCCC),
    surfaceContainerHighest=Color(0xFF222222),
    shadow=Color(0xFF000000).copy(alpha = 0.7f),
    
    keyboardSurface=Color(0xFF000000),
    // 👇 按键背景底色：去掉原本的紫调，改为纯深灰色
    keyboardContainer=Color(0xFF1E1E1E).copy(alpha = 0.8f),
    keyboardContainerVariant=Color(0xFF121212).copy(alpha = 0.5f),
    onKeyboardContainer=Color(0xFFE6E1E5).copy(alpha = 0.8f),
    
    // 👇 按键按下的波纹色：改为灰色
    keyboardPress=Color(0xFF444444),
    
    keyboardFade0=Color(0xFF000000),
    keyboardFade1=Color(0xFF000000),
    
    // 👇 输入光标/高亮光标：改为灰色
    primaryTransparent=Color(0xFFCCCCCC).copy(alpha = 0.3f),
    onSurfaceTransparent=Color(0xFFE6E1E5).copy(alpha = 0.1f),
)

val AMOLEDDark = ThemeOption(
    dynamic = false,
    key = "AMOLEDDark",
    name = R.string.theme_amoled_dark,
    available = { true }
) {
    AMOLEDDarkScheme
}

@Composable
@Preview
private fun PreviewTheme() {
    ThemePreview(AMOLEDDark)
}
