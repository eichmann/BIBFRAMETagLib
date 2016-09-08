package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UdcClassification theUdcClassification = (UdcClassification)findAncestorWithClass(this, UdcClassification.class);
			if (!theUdcClassification.commitNeeded) {
				pageContext.getOut().print(theUdcClassification.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			UdcClassification theUdcClassification = (UdcClassification)findAncestorWithClass(this, UdcClassification.class);
			return theUdcClassification.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing UdcClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			UdcClassification theUdcClassification = (UdcClassification)findAncestorWithClass(this, UdcClassification.class);
			theUdcClassification.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for subjectURI tag ");
		}
	}
}

