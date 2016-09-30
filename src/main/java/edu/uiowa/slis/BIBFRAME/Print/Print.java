package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Print extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static Print currentInstance = null;
	private static final Log log = LogFactory.getLog(Print.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String aspectRatio = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PrintIterator thePrintIterator = (PrintIterator) findAncestorWithClass(this, PrintIterator.class);

			if (thePrintIterator != null) {
				subjectURI = thePrintIterator.getSubjectURI();
				label = thePrintIterator.getLabel();
			}

			if (thePrintIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?aspectRatio where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://bib.ld4l.org/ontology/legacy/aspectRatio> ?aspectRatio } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					aspectRatio = sol.get("?aspectRatio") == null ? null : sol.get("?aspectRatio").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Print doStartTag", e);
			throw new JspTagException("Exception raised in Print doStartTag");
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
			log.error("Exception raised in Print doEndTag", e);
			throw new JspTagException("Exception raised in Print doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}

}
