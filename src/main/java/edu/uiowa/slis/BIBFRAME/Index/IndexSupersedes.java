package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexSupersedesIterator theIndexSupersedesIterator = (IndexSupersedesIterator)findAncestorWithClass(this, IndexSupersedesIterator.class);
			pageContext.getOut().print(theIndexSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

