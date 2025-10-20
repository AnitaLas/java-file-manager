# 🗂️ File Manager

All file and folder information is **displayed in the console**.

---

## 📋 List

Displays the list of folders and files in the current directory.

**Example:**

```
########## FILE MANAGER v0.1 ##########
Select option (list, details, foldertree, addfolder, addfile, exit)
list
Write path: (res/folderName or G:\folderName)
g:\z
f1
f2
f3
test0..txt
```

---

## 🧾 Details

Displays detailed information about folders and files in the current directory.

**Example:**

```
########## FILE MANAGER v0.1 ##########
Select option (list, details, foldertree, addfolder, addfile, exit)
details
Write path: (res/folderName or G:\folderName)
g:\z
Name                                    DIR or size                 Creation date             Modification date
f1                                             DIR           2025-02-12 20:38:19           2025-02-12 23:05:26
f2                                             DIR           2025-02-12 20:38:22           2025-02-12 20:38:22
f3                                             DIR           2025-02-12 20:38:25           2025-02-12 20:38:25
test0..txt                                       5           2025-10-20 11:31:31           2025-10-20 11:30:08
```

---

## 🌳 FolderTree

Displays all folders and files in the directory, with paths separated by `/`.

**Example:**

```
########## FILE MANAGER v0.1 ##########
Select option (list, details, foldertree, addfolder, addfile, exit)
foldertree
Write path: (res/folderName or G:\folderName)
g:\z
g:\z\f1
g:\z\f1\fgfgh
g:\z\f1\fgfgh\tes1..txt
g:\z\f1\fgg
g:\z\f1\fgg\ff
g:\z\f1\fgg\fff
g:\z\f1\fgg\fff\yyy
g:\z\f1\fsg
g:\z\f2
g:\z\f3
g:\z\test0..tx
```

---

## 📁 Add Folders

Create new folders in the current directory.

**Example:**

```
########## FILE MANAGER v0.1 ##########
Select option (list, details, foldertree, addfolder, addfile, exit)
addfolder
Folder name:
g:\z\f4
```

---

## 📄 Add Files

Add new files to folders in the current directory.

**Example:**

```
########## FILE MANAGER v0.1 ##########
Select option (list, details, foldertree, addfolder, addfile, exit)
addfile
File name:
g:\z\f4\testF4.txt
```

**Info:** The following is the console output after adding the folder and file:

```
########## FILE MANAGER v0.1 ##########
Select option (list, details, foldertree, addfolder, addfile, exit)
foldertree
Write path: (res/folderName or G:\folderName)
g:\z\f4\
g:\z\f4\testF4.txt
```
