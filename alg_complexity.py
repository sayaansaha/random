import argparse

#substrings
def find_substr(string,substring):
    i = 1 #counters to be used below
    n = len(string)
    m = len(substring)

    for i in range(1,(n-m)):
        j= 0
        while ((j<m) and n[i+j]== p[j]):
            j = j+1
        if (j == m):
            return i
    return "No matches"


def main():
    parser = argparse.ArgumentParser(description="find a substring in a string")
    parser.add("Text", type=str, help="Enter whole text")
    parser.add("substring", type=str, help="enter substring you wish to find in text")

    ars = parser.parse_args
    text = args.Text
    substring = args.substring

    find_substr(text,substring)

if __name__ == '__main__':
    main()
