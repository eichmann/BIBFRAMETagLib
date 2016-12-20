package edu.uiowa.slis.BIBFRAME.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ListLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ListLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			List theList = (List)findAncestorWithClass(this, List.class);
			if (!theList.commitNeeded) {
				pageContext.getOut().print(theList.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing List for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			List theList = (List)findAncestorWithClass(this, List.class);
			return theList.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing List for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			List theList = (List)findAncestorWithClass(this, List.class);
			theList.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing List for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for label tag ");
		}
	}
}

