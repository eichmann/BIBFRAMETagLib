package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			if (!theInstance.commitNeeded) {
				pageContext.getOut().print(theInstance.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			return theInstance.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Instance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			theInstance.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for label tag ");
		}
	}
}

