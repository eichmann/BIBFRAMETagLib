package edu.uiowa.slis.BIBFRAME.Istc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IstcSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IstcSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IstcSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Istc theIstc = (Istc)findAncestorWithClass(this, Istc.class);
			if (!theIstc.commitNeeded) {
				pageContext.getOut().print(theIstc.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Istc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Istc for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Istc theIstc = (Istc)findAncestorWithClass(this, Istc.class);
			return theIstc.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Istc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Istc for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Istc theIstc = (Istc)findAncestorWithClass(this, Istc.class);
			theIstc.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Istc for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Istc for subjectURI tag ");
		}
	}
}

