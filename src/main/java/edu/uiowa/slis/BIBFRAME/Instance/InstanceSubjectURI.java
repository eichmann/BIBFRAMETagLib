package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			if (!theInstance.commitNeeded) {
				pageContext.getOut().print(theInstance.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			return theInstance.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Instance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			theInstance.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for subjectURI tag ");
		}
	}
}

