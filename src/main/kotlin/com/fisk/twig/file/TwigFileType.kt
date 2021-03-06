package com.fisk.twig.file

import com.fisk.twig.TwigBundle
import com.fisk.twig.TwigLanguage
import com.fisk.twig.highlighting.TwigTemplateHighlighter
import com.fisk.twig.config.TwigIcons
import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.CharsetUtil
import com.intellij.openapi.fileTypes.FileTypeEditorHighlighterProviders
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.fileTypes.TemplateLanguageFileType
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.templateLanguages.TemplateDataLanguageMappings
import org.jetbrains.annotations.NonNls
import java.nio.charset.Charset

class TwigFileType private constructor(lang: Language) : LanguageFileType(lang), TemplateLanguageFileType {
    private constructor() : this(TwigLanguage.INSTANCE)

    init {
        val inst = FileTypeEditorHighlighterProviders.INSTANCE
        inst.addExplicitExtension(this) { project,
                                          fileType,
                                          virtualFile,
                                          editorColorsScheme ->
            TwigTemplateHighlighter(project, virtualFile, editorColorsScheme)
        }
    }

    override fun getName() = "Twig"

    override fun getDescription() = TwigBundle.message("twig.files.file.type.description")

    override fun getDefaultExtension() = DEFAULT_EXTENSION

    override fun getIcon() = TwigIcons.file_icon

    override fun extractCharsetFromFileContent(
            project: Project?,
            file: VirtualFile?,
            content: CharSequence
    ): Charset? {
        val associatedFileType = getAssociatedFileType(file, project) ?: return null
        return CharsetUtil.extractCharsetFromFileContent(project, file, associatedFileType, content)
    }

    companion object {
        val INSTANCE: LanguageFileType = TwigFileType()

        @NonNls
        val DEFAULT_EXTENSION = "twig"

        private fun getAssociatedFileType(file: VirtualFile?, project: Project?): LanguageFileType? {
            if (project == null) {
                return null
            }

            val language = TemplateDataLanguageMappings.getInstance(project).getMapping(file)
            return language?.associatedFileType ?: TwigLanguage.defaultTemplateLang
        }
    }
}
