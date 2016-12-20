package edu.uiowa.slis.BIBFRAME.NonSortElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NonSortElement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NonSortElement currentInstance = null;
	private static final Log log = LogFactory.getLog(NonSortElement.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NonSortElementIterator theNonSortElementIterator = (NonSortElementIterator) findAncestorWithClass(this, NonSortElementIterator.class);

			if (theNonSortElementIterator != null) {
				subjectURI = theNonSortElementIterator.getSubjectURI();
				label = theNonSortElementIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementFollowsIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementFollowsIterator)this.getParent()).getFollows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator)this.getParent()).getHasPart();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator)this.getParent()).getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator theResourceFollowsIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceFollowsIterator.class);

			if (subjectURI == null && theResourceFollowsIterator != null) {
				subjectURI = theResourceFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator theThingFollowsIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingFollowsIterator.class);

			if (subjectURI == null && theThingFollowsIterator != null) {
				subjectURI = theThingFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator theMainTitleElementFollowsIterator = (edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementFollowsIterator.class);

			if (subjectURI == null && theMainTitleElementFollowsIterator != null) {
				subjectURI = theMainTitleElementFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementFollowsIterator theTitleElementFollowsIterator = (edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementFollowsIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementFollowsIterator.class);

			if (subjectURI == null && theTitleElementFollowsIterator != null) {
				subjectURI = theTitleElementFollowsIterator.getFollows();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator theResourceHasPartIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceHasPartIterator.class);

			if (subjectURI == null && theResourceHasPartIterator != null) {
				subjectURI = theResourceHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator theThingHasPartIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingHasPartIterator.class);

			if (subjectURI == null && theThingHasPartIterator != null) {
				subjectURI = theThingHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator theTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasPartIterator.class);

			if (subjectURI == null && theTitleHasPartIterator != null) {
				subjectURI = theTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator theAbbreviatedTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.AbbreviatedTitle.AbbreviatedTitleHasPartIterator.class);

			if (subjectURI == null && theAbbreviatedTitleHasPartIterator != null) {
				subjectURI = theAbbreviatedTitleHasPartIterator.getHasPart();
			}

			edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator theKeyTitleHasPartIterator = (edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.KeyTitle.KeyTitleHasPartIterator.class);

			if (subjectURI == null && theKeyTitleHasPartIterator != null) {
				subjectURI = theKeyTitleHasPartIterator.getHasPart();
			}

			if (theNonSortElementIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in NonSortElement doStartTag", e);
			throw new JspTagException("Exception raised in NonSortElement doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in NonSortElement doEndTag", e);
			throw new JspTagException("Exception raised in NonSortElement doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public  void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public  String getSubjectURI() {
		return subjectURI;
	}

	public  void setLabel(String theLabel) {
		label = theLabel;
	}

	public  String getLabel() {
		return label;
	}

}
