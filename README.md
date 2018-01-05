# (WIP) intellij-community-twig

(WIP) A plugin to replace the official Twig plugin found in IntelliJ.

This is not production ready yet!! A lot of code has been sampled from the Handlebars plugin; this will eventually be replaced to suit Twig as I learn more about how IntelliJ works. 

## Why this exists

The official IntelliJ Twig plugin is pretty barebones. There are also some weird bugs that cause indentation to go wonky. But it's closed source and we can't do anything about it.

The Symfony plugin extends it with some nice features such as PHPDoc, but it's unable to add features like syntax validation without fully reimplementing the parser.

I would love to bridge the gap -- make the official plugin obsolete, and incorporate the extra features from the Symfony plugin. 

## TODO

### Feature parity with the official Twig plugin

- ~~[ ] Autocomplete for end braces~~ Perhaps we should not do this and do as HTML tags work in IDEA instead.
    - [x] Statements (`{% %}`)
    - [ ] Expressions (`{{ }}`)
    - [ ] Comments (`{% %}`)
- [ ] Prioritise hinting for close statements
- [x] Statement block indenting
- [ ] Remove additional whitespace in code cleanup
- [ ] Code style page
- [x] Code folding
- [x] Live templates

### Feature parity with community Symfony plugin Twig extensions

- [ ] Goto parent block
- [ ] Template include/extends/block resolution goto
- [ ] PHPDoc annotation support ({# @var thing \Core\Thing #})

### Supplementary

- [ ] Update whitespace control modifier on opposite brace
- [x] Structure View
    - [ ] Icons
- [x] Breadcrumbs
- [ ] Inspections
    - [ ] Expected end block tag -- needs protection against coalescence
    - [ ] Declared child blocks not found in the parent template
- [ ] Find usages
- [ ] Variable refactor
- [ ] Mixin refactor
- [ ] Configurable block tag options
- [ ] Switch between classic and new formatting styles (brace matching vs. HTML plugin style tag management)
- [ ] Automatic matching tag rename on type a la HTML plugin
- [ ] Fix live templates appearing in code completion list

## Development

Contributing to this project will require an environment ready to develop IntelliJ plugins. [Read the guide](https://www.jetbrains.com/help/idea/configuring-intellij-platform-plugin-sdk.html)

This is a Gradle project, so import `gradle.build` and it should do everything for you without additional configuration. 

Make sure tests pass, then make a pull request. If Travis fails to build your PR, please make additional changes.