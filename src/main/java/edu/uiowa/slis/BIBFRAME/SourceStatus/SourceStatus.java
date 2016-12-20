package edu.uiowa.slis.BIBFRAME.SourceStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class SourceStatus extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(SourceStatus.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			SourceStatusIterator theSourceStatusIterator = (SourceStatusIterator) findAncestorWithClass(this, SourceStatusIterator.class);

			if (theSourceStatusIterator != null) {
				subjectURI = theSourceStatusIterator.getSubjectURI();
				label = theSourceStatusIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator)this.getParent()).getHasSourceStatus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Resource.ResourceHasSourceStatusIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Resource.ResourceHasSourceStatusIterator)this.getParent()).getHasSourceStatus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Thing.ThingHasSourceStatusIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Thing.ThingHasSourceStatusIterator)this.getParent()).getHasSourceStatus();
			}

			edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator theTitleHasSourceStatusIterator = (edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Title.TitleHasSourceStatusIterator.class);

			if (subjectURI == null && theTitleHasSourceStatusIterator != null) {
				subjectURI = theTitleHasSourceStatusIterator.getHasSourceStatus();
			}

			edu.uiowa.slis.BIBFRAME.Resource.ResourceHasSourceStatusIterator theResourceHasSourceStatusIterator = (edu.uiowa.slis.BIBFRAME.Resource.ResourceHasSourceStatusIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Resource.ResourceHasSourceStatusIterator.class);

			if (subjectURI == null && theResourceHasSourceStatusIterator != null) {
				subjectURI = theResourceHasSourceStatusIterator.getHasSourceStatus();
			}

			edu.uiowa.slis.BIBFRAME.Thing.ThingHasSourceStatusIterator theThingHasSourceStatusIterator = (edu.uiowa.slis.BIBFRAME.Thing.ThingHasSourceStatusIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Thing.ThingHasSourceStatusIterator.class);

			if (subjectURI == null && theThingHasSourceStatusIterator != null) {
				subjectURI = theThingHasSourceStatusIterator.getHasSourceStatus();
			}

			if (theSourceStatusIterator == null && subjectURI == null) {
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
			log.error("Exception raised in SourceStatus doStartTag", e);
			throw new JspTagException("Exception raised in SourceStatus doStartTag");
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
			log.error("Exception raised in SourceStatus doEndTag", e);
			throw new JspTagException("Exception raised in SourceStatus doEndTag");
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
