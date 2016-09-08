package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Index theIndex = (Index)findAncestorWithClass(this, Index.class);
			if (!theIndex.commitNeeded) {
				pageContext.getOut().print(theIndex.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Index for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Index theIndex = (Index)findAncestorWithClass(this, Index.class);
			return theIndex.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Index for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Index theIndex = (Index)findAncestorWithClass(this, Index.class);
			theIndex.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Index for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for label tag ");
		}
	}
}

