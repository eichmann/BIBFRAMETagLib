package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceAspectRatio extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceAspectRatio currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceAspectRatio.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			if (!theInstance.commitNeeded) {
				pageContext.getOut().print(theInstance.getAspectRatio());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for aspectRatio tag ");
		}
		return SKIP_BODY;
	}

	public String getAspectRatio() throws JspTagException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			return theInstance.getAspectRatio();
		} catch (Exception e) {
			log.error(" Can't find enclosing Instance for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for aspectRatio tag ");
		}
	}

	public void setAspectRatio(String aspectRatio) throws JspTagException {
		try {
			Instance theInstance = (Instance)findAncestorWithClass(this, Instance.class);
			theInstance.setAspectRatio(aspectRatio);
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for aspectRatio tag ");
		}
	}
}

