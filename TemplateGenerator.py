from string import Template
import sys, getopt
import os

def usage():
    print(f'''Usage: python3 {sys.argv[0]} [-t templatedir | --template_dir=template_dir ] [-p package | --package_name=package_name] [-n name | --module_name=module_name]
    -t templatedir (VIPERTemplates ...)
    -p package_name (com.climax.template.Test)
    -n module_name (Test, Login ...)
    (e.g.)
    python3 TemplateGenerator.py -p com.climax.test.ui.login -n Login -t VIPERTemplates 
    ''')

def printDict(dict): 
    for key, value in dict.items():
        print(key, ' : ', value)

def main(argv):
    template_dir = ''
    package_name = ''
    module_name = ''
    lowercase_module_name = ''

    try:
        opts, args = getopt.getopt(argv[1:], "ht:p:n:", ["help", "template_dir=", "package_name=", "module_name="])
    except getopt.GetoptError:
        print(f'{argv[0]} -p <package_name> -n <module_name>')

    for opt, arg in opts:
        if opt in ('-h', '--help'):
            usage()
            sys.exit(1)
        elif opt in ('-t', '--template_dir'):
            template_dir = arg
        elif opt in ('-p', '--package_name'):
            package_name = arg
        elif opt in ('-n', '--module_name'):
            module_name = arg
            lowercase_module_name = module_name.lower()
            
    print("==================================================")
    print("[args]")
    print("template_dir : " + template_dir)
    print("package_name : " + package_name)
    print("module_name : " + module_name)
    print("lowercase_module_name : " + lowercase_module_name)

    if not template_dir or not package_name or not module_name or not lowercase_module_name:
        usage()
        sys.exit(1)

    print("==================================================")
    print("[Create output directory]")

    output_dir = "output"
    if not os.path.exists(output_dir):
        os.mkdir(output_dir)
        print("Directory " + output_dir + " Created")
    else:
        print("Directory " + output_dir + " already exists")
    

    mapping = {
        'package_name': package_name,
        'module_name': module_name,
        'lowercase_module_name': lowercase_module_name
    }

    print("==================================================")
    print("[mapping]")
    printDict(mapping)

    for filename in os.listdir(template_dir):
        print("==================================================")
        print("[generate template information]")
        print("filename : " + filename)

        filepath = os.path.join(template_dir, filename)
        print("filepath : " + filepath)

        if os.path.isfile(filepath):
            with open(filepath, 'r') as f:
                src = Template(f.read())
                result = src.substitute(mapping)
                # print(result)

                write_filename = ''
                if "xml" in filename:
                    index = filename.find('.xml')
                    write_filename = filename[:index] + "_" + module_name.lower() + filename[index:]
                else:
                    write_filename = module_name + filename

                write_filename = output_dir + "/" + write_filename
                print("write_filename : " + write_filename)
                
                with open(write_filename, 'w') as f:
                    f.write(result)

if __name__ == '__main__':
    main(sys.argv)
