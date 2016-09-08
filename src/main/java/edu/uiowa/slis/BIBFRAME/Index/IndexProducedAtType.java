package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexProducedAtIterator theIndexProducedAtIterator = (IndexProducedAtIterator)findAncestorWithClass(this, IndexProducedAtIterator.class);
			pageContext.getOut().print(theIndexProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

