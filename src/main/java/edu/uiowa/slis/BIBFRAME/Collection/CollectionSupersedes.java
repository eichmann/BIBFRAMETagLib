package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionSupersedesIterator theCollectionSupersedesIterator = (CollectionSupersedesIterator)findAncestorWithClass(this, CollectionSupersedesIterator.class);
			pageContext.getOut().print(theCollectionSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

