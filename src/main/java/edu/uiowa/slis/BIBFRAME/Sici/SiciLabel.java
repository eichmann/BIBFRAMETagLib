package edu.uiowa.slis.BIBFRAME.Sici;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SiciLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SiciLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SiciLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sici theSici = (Sici)findAncestorWithClass(this, Sici.class);
			if (!theSici.commitNeeded) {
				pageContext.getOut().print(theSici.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sici for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sici for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Sici theSici = (Sici)findAncestorWithClass(this, Sici.class);
			return theSici.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sici for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sici for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Sici theSici = (Sici)findAncestorWithClass(this, Sici.class);
			theSici.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Sici for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sici for label tag ");
		}
	}
}

