package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionPerformedAtIterator theCollectionPerformedAtIterator = (CollectionPerformedAtIterator)findAncestorWithClass(this, CollectionPerformedAtIterator.class);
			pageContext.getOut().print(theCollectionPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

