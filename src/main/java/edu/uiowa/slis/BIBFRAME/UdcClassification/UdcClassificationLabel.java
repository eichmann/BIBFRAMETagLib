package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UdcClassification theUdcClassification = (UdcClassification)findAncestorWithClass(this, UdcClassification.class);
			if (!theUdcClassification.commitNeeded) {
				pageContext.getOut().print(theUdcClassification.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			UdcClassification theUdcClassification = (UdcClassification)findAncestorWithClass(this, UdcClassification.class);
			return theUdcClassification.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing UdcClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			UdcClassification theUdcClassification = (UdcClassification)findAncestorWithClass(this, UdcClassification.class);
			theUdcClassification.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for label tag ");
		}
	}
}

