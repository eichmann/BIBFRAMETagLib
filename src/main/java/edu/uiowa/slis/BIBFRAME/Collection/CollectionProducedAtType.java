package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionProducedAtIterator theCollectionProducedAtIterator = (CollectionProducedAtIterator)findAncestorWithClass(this, CollectionProducedAtIterator.class);
			pageContext.getOut().print(theCollectionProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for producedAt tag ");
		}
		return SKIP_BODY;
	}
}
