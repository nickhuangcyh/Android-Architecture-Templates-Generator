# Android-Architecture-Templates-Generator

`Android-Architecture-Templates-Generator` is a program for generating Android architecture template code.

## Usage

`Android-Architecture-Templates-Generator` requires [python3](https://www.python.org/downloads/) environment.

```
python3 TemplateGenerator.py -p `Your.package.name` -n `Your module name` -t `Using Template Folder`
```

| Options               | Description                               |
| :---------------------| :-----------------------------------------|
| -t, --template_dir    | templatedir (VIPERTemplates ...)          |
| -p, --package_name    | package_name (com.climax.template. Test)   |
| -n, --module_name     | module_name (Test, Login ...)             |

## Demo

![](https://raw.githubusercontent.com/nickhuangcyh/Android-Architecture-Templates-Generator/master/Resources/demo.gif)

## More Documentation

`python3 TemplateGenerator.py -h` or `python3 TemplateGenerator.py --help`
