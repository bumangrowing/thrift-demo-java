/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.buman.player;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-01-13")
public class Player implements org.apache.thrift.TBase<Player, Player._Fields>, java.io.Serializable, Cloneable, Comparable<Player> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Player");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ROLE_FIELD_DESC = new org.apache.thrift.protocol.TField("role", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField CP_FIELD_DESC = new org.apache.thrift.protocol.TField("cp", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField GUILD_FIELD_DESC = new org.apache.thrift.protocol.TField("guild", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PlayerStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PlayerTupleSchemeFactory();

  public int id; // required
  public @org.apache.thrift.annotation.Nullable String name; // required
  /**
   * 
   * @see RoleEnum
   */
  public @org.apache.thrift.annotation.Nullable RoleEnum role; // required
  /**
   * 
   * @see GenderEnum
   */
  public @org.apache.thrift.annotation.Nullable GenderEnum gender; // required
  public @org.apache.thrift.annotation.Nullable Player cp; // required
  public @org.apache.thrift.annotation.Nullable io.buman.guild.Guild guild; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    /**
     * 
     * @see RoleEnum
     */
    ROLE((short)3, "role"),
    /**
     * 
     * @see GenderEnum
     */
    GENDER((short)4, "gender"),
    CP((short)5, "cp"),
    GUILD((short)6, "guild");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // ROLE
          return ROLE;
        case 4: // GENDER
          return GENDER;
        case 5: // CP
          return CP;
        case 6: // GUILD
          return GUILD;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROLE, new org.apache.thrift.meta_data.FieldMetaData("role", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RoleEnum.class)));
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GenderEnum.class)));
    tmpMap.put(_Fields.CP, new org.apache.thrift.meta_data.FieldMetaData("cp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "Player")));
    tmpMap.put(_Fields.GUILD, new org.apache.thrift.meta_data.FieldMetaData("guild", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, io.buman.guild.Guild.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Player.class, metaDataMap);
  }

  public Player() {
    this.gender = GenderEnum.UNKNOWN;

  }

  public Player(
    int id,
    String name,
    RoleEnum role,
    GenderEnum gender,
    Player cp,
    io.buman.guild.Guild guild)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.name = name;
    this.role = role;
    this.gender = gender;
    this.cp = cp;
    this.guild = guild;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Player(Player other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetRole()) {
      this.role = other.role;
    }
    if (other.isSetGender()) {
      this.gender = other.gender;
    }
    if (other.isSetCp()) {
      this.cp = new Player(other.cp);
    }
    if (other.isSetGuild()) {
      this.guild = new io.buman.guild.Guild(other.guild);
    }
  }

  public Player deepCopy() {
    return new Player(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    this.role = null;
    this.gender = GenderEnum.UNKNOWN;

    this.cp = null;
    this.guild = null;
  }

  public int getId() {
    return this.id;
  }

  public Player setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public String getName() {
    return this.name;
  }

  public Player setName(@org.apache.thrift.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  /**
   * 
   * @see RoleEnum
   */
  @org.apache.thrift.annotation.Nullable
  public RoleEnum getRole() {
    return this.role;
  }

  /**
   * 
   * @see RoleEnum
   */
  public Player setRole(@org.apache.thrift.annotation.Nullable RoleEnum role) {
    this.role = role;
    return this;
  }

  public void unsetRole() {
    this.role = null;
  }

  /** Returns true if field role is set (has been assigned a value) and false otherwise */
  public boolean isSetRole() {
    return this.role != null;
  }

  public void setRoleIsSet(boolean value) {
    if (!value) {
      this.role = null;
    }
  }

  /**
   * 
   * @see GenderEnum
   */
  @org.apache.thrift.annotation.Nullable
  public GenderEnum getGender() {
    return this.gender;
  }

  /**
   * 
   * @see GenderEnum
   */
  public Player setGender(@org.apache.thrift.annotation.Nullable GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  public void unsetGender() {
    this.gender = null;
  }

  /** Returns true if field gender is set (has been assigned a value) and false otherwise */
  public boolean isSetGender() {
    return this.gender != null;
  }

  public void setGenderIsSet(boolean value) {
    if (!value) {
      this.gender = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Player getCp() {
    return this.cp;
  }

  public Player setCp(@org.apache.thrift.annotation.Nullable Player cp) {
    this.cp = cp;
    return this;
  }

  public void unsetCp() {
    this.cp = null;
  }

  /** Returns true if field cp is set (has been assigned a value) and false otherwise */
  public boolean isSetCp() {
    return this.cp != null;
  }

  public void setCpIsSet(boolean value) {
    if (!value) {
      this.cp = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public io.buman.guild.Guild getGuild() {
    return this.guild;
  }

  public Player setGuild(@org.apache.thrift.annotation.Nullable io.buman.guild.Guild guild) {
    this.guild = guild;
    return this;
  }

  public void unsetGuild() {
    this.guild = null;
  }

  /** Returns true if field guild is set (has been assigned a value) and false otherwise */
  public boolean isSetGuild() {
    return this.guild != null;
  }

  public void setGuildIsSet(boolean value) {
    if (!value) {
      this.guild = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case ROLE:
      if (value == null) {
        unsetRole();
      } else {
        setRole((RoleEnum)value);
      }
      break;

    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((GenderEnum)value);
      }
      break;

    case CP:
      if (value == null) {
        unsetCp();
      } else {
        setCp((Player)value);
      }
      break;

    case GUILD:
      if (value == null) {
        unsetGuild();
      } else {
        setGuild((io.buman.guild.Guild)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case ROLE:
      return getRole();

    case GENDER:
      return getGender();

    case CP:
      return getCp();

    case GUILD:
      return getGuild();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case ROLE:
      return isSetRole();
    case GENDER:
      return isSetGender();
    case CP:
      return isSetCp();
    case GUILD:
      return isSetGuild();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Player)
      return this.equals((Player)that);
    return false;
  }

  public boolean equals(Player that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_role = true && this.isSetRole();
    boolean that_present_role = true && that.isSetRole();
    if (this_present_role || that_present_role) {
      if (!(this_present_role && that_present_role))
        return false;
      if (!this.role.equals(that.role))
        return false;
    }

    boolean this_present_gender = true && this.isSetGender();
    boolean that_present_gender = true && that.isSetGender();
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (!this.gender.equals(that.gender))
        return false;
    }

    boolean this_present_cp = true && this.isSetCp();
    boolean that_present_cp = true && that.isSetCp();
    if (this_present_cp || that_present_cp) {
      if (!(this_present_cp && that_present_cp))
        return false;
      if (!this.cp.equals(that.cp))
        return false;
    }

    boolean this_present_guild = true && this.isSetGuild();
    boolean that_present_guild = true && that.isSetGuild();
    if (this_present_guild || that_present_guild) {
      if (!(this_present_guild && that_present_guild))
        return false;
      if (!this.guild.equals(that.guild))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetRole()) ? 131071 : 524287);
    if (isSetRole())
      hashCode = hashCode * 8191 + role.getValue();

    hashCode = hashCode * 8191 + ((isSetGender()) ? 131071 : 524287);
    if (isSetGender())
      hashCode = hashCode * 8191 + gender.getValue();

    hashCode = hashCode * 8191 + ((isSetCp()) ? 131071 : 524287);
    if (isSetCp())
      hashCode = hashCode * 8191 + cp.hashCode();

    hashCode = hashCode * 8191 + ((isSetGuild()) ? 131071 : 524287);
    if (isSetGuild())
      hashCode = hashCode * 8191 + guild.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Player other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRole()).compareTo(other.isSetRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.role, other.role);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGender()).compareTo(other.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gender, other.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCp()).compareTo(other.isSetCp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cp, other.cp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGuild()).compareTo(other.isSetGuild());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuild()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.guild, other.guild);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Player(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("role:");
    if (this.role == null) {
      sb.append("null");
    } else {
      sb.append(this.role);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gender:");
    if (this.gender == null) {
      sb.append("null");
    } else {
      sb.append(this.gender);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cp:");
    if (this.cp == null) {
      sb.append("null");
    } else {
      sb.append(this.cp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("guild:");
    if (this.guild == null) {
      sb.append("null");
    } else {
      sb.append(this.guild);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (role == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'role' was not present! Struct: " + toString());
    }
    if (gender == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gender' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (guild != null) {
      guild.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PlayerStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PlayerStandardScheme getScheme() {
      return new PlayerStandardScheme();
    }
  }

  private static class PlayerStandardScheme extends org.apache.thrift.scheme.StandardScheme<Player> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Player struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.role = RoleEnum.findByValue(iprot.readI32());
              struct.setRoleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.gender = GenderEnum.findByValue(iprot.readI32());
              struct.setGenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cp = new Player();
              struct.cp.read(iprot);
              struct.setCpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GUILD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.guild = new io.buman.guild.Guild();
              struct.guild.read(iprot);
              struct.setGuildIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Player struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.role != null) {
        oprot.writeFieldBegin(ROLE_FIELD_DESC);
        oprot.writeI32(struct.role.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.gender != null) {
        oprot.writeFieldBegin(GENDER_FIELD_DESC);
        oprot.writeI32(struct.gender.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.cp != null) {
        oprot.writeFieldBegin(CP_FIELD_DESC);
        struct.cp.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.guild != null) {
        oprot.writeFieldBegin(GUILD_FIELD_DESC);
        struct.guild.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PlayerTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PlayerTupleScheme getScheme() {
      return new PlayerTupleScheme();
    }
  }

  private static class PlayerTupleScheme extends org.apache.thrift.scheme.TupleScheme<Player> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Player struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeI32(struct.role.getValue());
      oprot.writeI32(struct.gender.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCp()) {
        optionals.set(1);
      }
      if (struct.isSetGuild()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetCp()) {
        struct.cp.write(oprot);
      }
      if (struct.isSetGuild()) {
        struct.guild.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Player struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.role = RoleEnum.findByValue(iprot.readI32());
      struct.setRoleIsSet(true);
      struct.gender = GenderEnum.findByValue(iprot.readI32());
      struct.setGenderIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cp = new Player();
        struct.cp.read(iprot);
        struct.setCpIsSet(true);
      }
      if (incoming.get(2)) {
        struct.guild = new io.buman.guild.Guild();
        struct.guild.read(iprot);
        struct.setGuildIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

