package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class AbbreviatedTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitle.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AbbreviatedTitleIterator theAbbreviatedTitleIterator = (AbbreviatedTitleIterator) findAncestorWithClass(this, AbbreviatedTitleIterator.class);

			if (theAbbreviatedTitleIterator != null) {
				subjectURI = theAbbreviatedTitleIterator.getSubjectURI();
				label = theAbbreviatedTitleIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator)this.getParent()).getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator theResourceIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceIsPartOfIterator.class);

			if (subjectURI == null && theResourceIsPartOfIterator != null) {
				subjectURI = theResourceIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator theThingIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingIsPartOfIterator.class);

			if (subjectURI == null && theThingIsPartOfIterator != null) {
				subjectURI = theThingIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementIsPartOfIterator theTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.TitleElement.TitleElementIsPartOfIterator.class);

			if (subjectURI == null && theTitleElementIsPartOfIterator != null) {
				subjectURI = theTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator theMainTitleElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.MainTitleElement.MainTitleElementIsPartOfIterator.class);

			if (subjectURI == null && theMainTitleElementIsPartOfIterator != null) {
				subjectURI = theMainTitleElementIsPartOfIterator.getIsPartOf();
			}

			edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator theNonSortElementIsPartOfIterator = (edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.NonSortElement.NonSortElementIsPartOfIterator.class);

			if (subjectURI == null && theNonSortElementIsPartOfIterator != null) {
				subjectURI = theNonSortElementIsPartOfIterator.getIsPartOf();
			}

			if (theAbbreviatedTitleIterator == null && subjectURI == null) {
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
			log.error("Exception raised in AbbreviatedTitle doStartTag", e);
			throw new JspTagException("Exception raised in AbbreviatedTitle doStartTag");
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
			log.error("Exception raised in AbbreviatedTitle doEndTag", e);
			throw new JspTagException("Exception raised in AbbreviatedTitle doEndTag");
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
