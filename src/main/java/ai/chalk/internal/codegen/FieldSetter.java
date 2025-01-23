package ai.chalk.internal.codegen;

import ai.chalk.internal.FieldMeta;

import java.util.List;


/* Information pertinent to setting fields on an object.
 * to be returned from the scoped feature initializer.
 *
 * i.e. If we call the scoped initializer on "user.account.created_at",
 *      then FieldSetter will contain the `Account` object and the `FieldMeta`
 *      for "created_at". This class can be done away with when everything in
 *      a `FeaturesBase` subclass is a `Feature`, since by then we will be able
 *      to return a list of `Feature`s.  Right now dataclasses and has-ones are
 *      not `Feature`s, which is a design mistake. CHA-5646
 */
public record FieldSetter(Object parent, List<FieldMeta> fieldMetas) {}
