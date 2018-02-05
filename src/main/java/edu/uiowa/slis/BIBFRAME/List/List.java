package edu.uiowa.slis.BIBFRAME.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class List extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static List currentInstance = null;
	private static final Log log = LogFactory.getLog(List.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ListIterator theListIterator = (ListIterator) findAncestorWithClass(this, ListIterator.class);

			if (theListIterator != null) {
				subjectURI = theListIterator.getSubjectURI();
				label = theListIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.List.ListRestIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.List.ListRestIterator)this.getParent()).getRest();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Class.ClassIntersectionOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Class.ClassIntersectionOfIterator)this.getParent()).getIntersectionOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.BIBFRAME.Class.ClassUnionOfIterator) {
				subjectURI = ((edu.uiowa.slis.BIBFRAME.Class.ClassUnionOfIterator)this.getParent()).getUnionOf();
			}

			edu.uiowa.slis.BIBFRAME.List.ListRestIterator theListRestIterator = (edu.uiowa.slis.BIBFRAME.List.ListRestIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.List.ListRestIterator.class);

			if (subjectURI == null && theListRestIterator != null) {
				subjectURI = theListRestIterator.getRest();
			}

			edu.uiowa.slis.BIBFRAME.Class.ClassIntersectionOfIterator theClassIntersectionOfIterator = (edu.uiowa.slis.BIBFRAME.Class.ClassIntersectionOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Class.ClassIntersectionOfIterator.class);

			if (subjectURI == null && theClassIntersectionOfIterator != null) {
				subjectURI = theClassIntersectionOfIterator.getIntersectionOf();
			}

			edu.uiowa.slis.BIBFRAME.Class.ClassUnionOfIterator theClassUnionOfIterator = (edu.uiowa.slis.BIBFRAME.Class.ClassUnionOfIterator) findAncestorWithClass(this, edu.uiowa.slis.BIBFRAME.Class.ClassUnionOfIterator.class);

			if (subjectURI == null && theClassUnionOfIterator != null) {
				subjectURI = theClassUnionOfIterator.getUnionOf();
			}

			if (theListIterator == null && subjectURI == null) {
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
			log.error("Exception raised in List doStartTag", e);
			throw new JspTagException("Exception raised in List doStartTag");
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
			log.error("Exception raised in List doEndTag", e);
			throw new JspTagException("Exception raised in List doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

}
