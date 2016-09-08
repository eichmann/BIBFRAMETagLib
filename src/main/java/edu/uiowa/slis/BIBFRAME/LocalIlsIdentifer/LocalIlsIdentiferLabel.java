package edu.uiowa.slis.BIBFRAME.LocalIlsIdentifer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocalIlsIdentiferLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LocalIlsIdentiferLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LocalIlsIdentiferLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LocalIlsIdentifer theLocalIlsIdentifer = (LocalIlsIdentifer)findAncestorWithClass(this, LocalIlsIdentifer.class);
			if (!theLocalIlsIdentifer.commitNeeded) {
				pageContext.getOut().print(theLocalIlsIdentifer.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LocalIlsIdentifer for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LocalIlsIdentifer for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LocalIlsIdentifer theLocalIlsIdentifer = (LocalIlsIdentifer)findAncestorWithClass(this, LocalIlsIdentifer.class);
			return theLocalIlsIdentifer.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LocalIlsIdentifer for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LocalIlsIdentifer for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LocalIlsIdentifer theLocalIlsIdentifer = (LocalIlsIdentifer)findAncestorWithClass(this, LocalIlsIdentifer.class);
			theLocalIlsIdentifer.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LocalIlsIdentifer for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LocalIlsIdentifer for label tag ");
		}
	}
}

