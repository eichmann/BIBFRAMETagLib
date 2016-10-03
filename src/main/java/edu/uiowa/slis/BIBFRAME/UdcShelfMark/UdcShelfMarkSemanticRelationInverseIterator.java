package edu.uiowa.slis.BIBFRAME.UdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class UdcShelfMarkSemanticRelationInverseIterator extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcShelfMarkSemanticRelationInverseIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcShelfMarkSemanticRelationInverseIterator.class);

	String subjectURI = null;
	String type = null;
	String semanticRelationInverse = null;
	ResultSet rs = null;
	Hashtable<String,String> classFilter = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			UdcShelfMark theUdcShelfMark = (UdcShelfMark) findAncestorWithClass(this, UdcShelfMark.class);

			if (theUdcShelfMark != null) {
				subjectURI = theUdcShelfMark.getSubjectURI();
			}

			if (theUdcShelfMark == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s ?t where {"
					+" ?s <http://www.w3.org/2004/02/skos/core#semanticRelation> <" + subjectURI+ "> . "
					+" ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?t ."
					+" FILTER NOT EXISTS {"
					+"   ?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?subtype ."
					+"   ?subtype <http://www.w3.org/2000/01/rdf-schema#subClassOf> ?t ."
					+"   filter ( ?subtype != ?t )"
					+" }"
					+"} ");
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				semanticRelationInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + semanticRelationInverse + "	type: " + type);
					return EVAL_BODY_INCLUDE;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in UdcShelfMarkSemanticRelationInverseIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in UdcShelfMarkSemanticRelationInverseIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			while(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				semanticRelationInverse = sol.get("?s").toString();
				type = getLocalName(sol.get("?t").toString());
				if (type == null)
					continue;
				if (classFilter == null || (classFilter != null && type != null && classFilter.containsKey(type))) {
					log.info("instance: " + semanticRelationInverse + "	type: " + type);
					return EVAL_BODY_AGAIN;
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in UdcShelfMarkSemanticRelationIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in UdcShelfMarkSemanticRelationIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in UdcShelfMarkSemanticRelation doEndTag", e);
			throw new JspTagException("Exception raised in UdcShelfMarkSemanticRelation doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
		type = null;
		semanticRelationInverse = null;
		classFilter = null;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setSemanticRelationInverse(String semanticRelationInverse) {
		this.semanticRelationInverse = semanticRelationInverse;
	}

	public String getSemanticRelationInverse() {
		return semanticRelationInverse;
	}

	public void setClassFilter(String filterString) {
		String[] classFilterArray = filterString.split(" ");
		this.classFilter = new Hashtable<String, String>();
		for (String filterClass : classFilterArray) {
			log.info("adding filterClass " + filterClass + " to UdcShelfMarkSemanticRelationIterator");
			classFilter.put(filterClass, "");
		}
	}

	public String getClassFilter() {
		return classFilter.toString();
	}

}
