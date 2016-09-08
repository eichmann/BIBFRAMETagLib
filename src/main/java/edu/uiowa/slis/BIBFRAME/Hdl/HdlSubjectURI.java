package edu.uiowa.slis.BIBFRAME.Hdl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HdlSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static HdlSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(HdlSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hdl theHdl = (Hdl)findAncestorWithClass(this, Hdl.class);
			if (!theHdl.commitNeeded) {
				pageContext.getOut().print(theHdl.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hdl for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hdl for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Hdl theHdl = (Hdl)findAncestorWithClass(this, Hdl.class);
			return theHdl.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hdl for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hdl for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Hdl theHdl = (Hdl)findAncestorWithClass(this, Hdl.class);
			theHdl.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Hdl for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hdl for subjectURI tag ");
		}
	}
}

