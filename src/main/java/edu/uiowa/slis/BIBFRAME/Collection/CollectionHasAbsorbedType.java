package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionHasAbsorbedIterator theCollectionHasAbsorbedIterator = (CollectionHasAbsorbedIterator)findAncestorWithClass(this, CollectionHasAbsorbedIterator.class);
			pageContext.getOut().print(theCollectionHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

