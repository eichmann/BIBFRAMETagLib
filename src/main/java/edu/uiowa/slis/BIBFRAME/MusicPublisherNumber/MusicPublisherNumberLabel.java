package edu.uiowa.slis.BIBFRAME.MusicPublisherNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MusicPublisherNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MusicPublisherNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MusicPublisherNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MusicPublisherNumber theMusicPublisherNumber = (MusicPublisherNumber)findAncestorWithClass(this, MusicPublisherNumber.class);
			if (!theMusicPublisherNumber.commitNeeded) {
				pageContext.getOut().print(theMusicPublisherNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPublisherNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			MusicPublisherNumber theMusicPublisherNumber = (MusicPublisherNumber)findAncestorWithClass(this, MusicPublisherNumber.class);
			return theMusicPublisherNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing MusicPublisherNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			MusicPublisherNumber theMusicPublisherNumber = (MusicPublisherNumber)findAncestorWithClass(this, MusicPublisherNumber.class);
			theMusicPublisherNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPublisherNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for label tag ");
		}
	}
}

