# NOTE: This file is auto generated by OpenAPI Generator 7.12.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.ClassModel do
  @moduledoc """
  Model for testing model with \"_class\" property
  """

  @derive Jason.Encoder
  defstruct [
    :_class
  ]

  @type t :: %__MODULE__{
    :_class => String.t | nil
  }

  def decode(value) do
    value
  end
end

