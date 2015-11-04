package example

import com.amazonaws.services.lambda.runtime.Context

class Main {
  def handler(context: Context): String = {
    print("boom")
    "boom"
  }
}
